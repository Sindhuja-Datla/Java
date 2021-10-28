import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.text.Normalizer.Form;
import java.util.Collection;

import org.junit.Test;

import static org.hamcrest.core.IsCollectionContaining.*;

public class Unit {

    @Test
    public void test() {
        Collection<Form> a = doSomething();
        Collection<Form> expectedAnswer;
		Collection<Form> b = expectedAnswer;

        assertThat(a, both(hasItems(b)).and(hasSize(b.size())));
    }

    private Collection<Form> doSomething() {
		// TODO Auto-generated method stub
		return null;
	}

    @Test
    public void testBeans() {
        Collection<Foo> a = doSomething();
        Collection<Foo> b = expectedAnswer;
        Collection<Matcher<Foo>> bBeanMatchers =
          new LinkedList<Matcher<Foo>>();

        // create a matcher that checks for the property values of each Foo
        for(Foo foo: B)
            bBeanMatchers.add(new SamePropertyValuesAs(foo));

        assertThat(a, both(hasItems(bBeanMatchers)).and(hasSize(b.size())))
    }
}