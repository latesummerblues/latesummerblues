//
// Generated from archetype; please customize.
//

package latesummerblues.experiments

import org.junit.Test;

import latesummerblues.experiments.Helper
import latesummerblues.experiments.Example

/**
 * Tests for the {@link Helper} class.
 */
class HelperTest
    /*extends GroovyTestCase*/
{
	public HelperTest() {}
	
	@Test
    void testHelp() {
        new Helper().help(new Example())
    }
}
