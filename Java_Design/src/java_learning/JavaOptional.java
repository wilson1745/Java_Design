package java_learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class JavaOptional {

	/*
	 * There are several ways of creating Optional objects. To create an empty
	 * Optional object, we simply need to use its empty static method:
	 * 
	 */
	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
		Optional<String> empty = Optional.empty();
		assertFalse(empty.isPresent());
	}

	/*
	 * Note that we used the isPresent() method to check if there is a value inside
	 * the Optional object. A value is present only if we have created Optional with
	 * a non-null value. We¡¯ll look at the isPresent method in the next section.
	 * 
	 * We can also create an Optional object with the static method of:
	 */
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
		String name = "baeldung";
		Optional<String> opt = Optional.of(name);
		assertTrue(opt.isPresent());
	}

	/*
	 * However, the argument passed to the of() method can¡¯t be null. Otherwise,
	 * we¡¯ll get a NullPointerException:
	 */
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
		String name = null;
		Optional.of(name);
	}

	/*
	 * But, in case we expect some null values, we can use the ofNullable() method:
	 * 
	 */
	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
		String name = "baeldung";
		Optional<String> opt = Optional.ofNullable(name);
		assertTrue(opt.isPresent());
	}

	/*
	 * By doing this, if we pass in a null reference, it doesn¡¯t throw an exception
	 * but rather returns an empty Optional object:
	 * 
	 */
	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		assertFalse(opt.isPresent());
	}

	/*
	 * The ifPresent() method enables us to run some code on the wrapped value if
	 * it¡¯s found to be non-null. Before Optional, we¡¯d do:
	 * 
	 */
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		opt.ifPresent(name -> System.out.println(name.length()));
	}

	/* Default Value With orElse() */
	@Test
	public void whenOrElseWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		assertEquals("john", name);
	}

	/* Default Value With orElseGet() */
	@Test
	public void whenOrElseGetWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
		assertEquals("john", name);
	}

	/* Difference Between orElse and orElseGet() */
	public String getMyDefault() {
		System.out.println("Getting Default Value");
		return "Default Value";
	}

	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
		String text = null;

		String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
		assertEquals("Default Value", defaultText);

		defaultText = Optional.ofNullable(text).orElse(getMyDefault());
		assertEquals("Default Value", defaultText);
	}

	@Test
	public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
		String text = "Text present";

		System.out.println("Using orElseGet:");
		String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
		assertEquals("Text present", defaultText);

		System.out.println("Using orElse:");
		defaultText = Optional.ofNullable(text).orElse(getMyDefault());
		assertEquals("Text present", defaultText);
	}

	/* Exceptions with orElseThrow() */
	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
	}

	/* Returning Value with get() */
	@Test
	public void givenOptional_whenGetsValue_thenCorrect() {
		Optional<String> opt = Optional.of("baeldung");
		String name = opt.get();
		assertEquals("baeldung", name);
	}

	/*
	 * However, unlike the above three approaches, get() can only return a value if
	 * the wrapped object is not null, otherwise, it throws a no such element
	 * exception:
	 * 
	 */
	@Test(expected = NoSuchElementException.class)
	public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
		Optional<String> opt = Optional.ofNullable(null);
		String name = opt.get();
	}

	/* Conditional Return with filter() */
	@Test
	public void whenOptionalFilterWorks_thenCorrect() {
		Integer year = 2016;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
		assertTrue(is2016);
		boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
		assertFalse(is2017);
	}

	/* Transforming Value with map() */
	@Test
	public void givenOptional_whenMapWorks_thenCorrect() {
		List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
		Optional<List<String>> listOptional = Optional.of(companyNames);

		int size = listOptional.map(List::size).orElse(0);
		assertEquals(6, size);
	}

	@Test
	public void givenOptional_whenMapWorks_thenCorrect2() {
		String name = "baeldung";
		Optional<String> nameOptional = Optional.of(name);

		int len = nameOptional.map(String::length).orElse(0);
		assertEquals(8, len);
	}

	@Test
	public void givenOptional_whenMapWorksWithFilter_thenCorrect() {
		String password = " password ";
		Optional<String> passOpt = Optional.of(password);
		boolean correctPassword = passOpt.filter(pass -> pass.equals("password")).isPresent();
		assertFalse(correctPassword);

		correctPassword = passOpt.map(String::trim).filter(pass -> pass.equals("password")).isPresent();
		assertTrue(correctPassword);
	}

	/* Transforming Value with flatMap() */
	@Test
	public void givenOptional_whenFlatMapWorks_thenCorrect2() {
		Person person = new Person("john", 26);
		Optional<Person> personOptional = Optional.of(person);

		Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
		Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
		String name1 = nameOptional.orElse("");
		assertEquals("john", name1);

		String name = personOptional.flatMap(Person::getName).orElse("");
		assertEquals("john", name);
	}

	/* Chaining Optionals in Java 8 */
	private Optional<String> getEmpty() {
		return Optional.empty();
	}

	private Optional<String> getHello() {
		return Optional.of("hello");
	}

	private Optional<String> getBye() {
		return Optional.of("bye");
	}

	private Optional<String> createOptional(String input) {
		if (input == null || "".equals(input) || "empty".equals(input)) {
			return Optional.empty();
		}
		return Optional.of(input);
	}

	@Test
	public void givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturned() {
		Optional<String> found = Stream.of(getEmpty(), getHello(), getBye()).filter(Optional::isPresent)
				.map(Optional::get).findFirst();

		assertEquals(getHello(), found);
	}

	@Test
	public void givenThreeOptionals_whenChaining_thenFirstNonEmptyIsReturnedAndRestNotEvaluated() {
		Optional<String> found = Stream.<Supplier<Optional<String>>>of(this::getEmpty, this::getHello, this::getBye)
				.map(Supplier::get).filter(Optional::isPresent).map(Optional::get).findFirst();

		assertEquals(getHello(), found);
	}

	@Test
	public void givenTwoOptionalsReturnedByOneArgMethod_whenChaining_thenFirstNonEmptyIsReturned() {
		Optional<String> found = Stream
				.<Supplier<Optional<String>>>of(() -> createOptional("empty"), () -> createOptional("hello"))
				.map(Supplier::get).filter(Optional::isPresent).map(Optional::get).findFirst();

		assertEquals(createOptional("hello"), found);
	}

	@Test
	public void givenTwoEmptyOptionals_whenChaining_thenDefaultIsReturned() {
		String found = Stream
				.<Supplier<Optional<String>>>of(() -> createOptional("empty"), () -> createOptional("empty"))
				.map(Supplier::get).filter(Optional::isPresent).map(Optional::get).findFirst()
				.orElseGet(() -> "default");

		assertEquals("default", found);
	}

}
