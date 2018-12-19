package az.inheritedinterceptor;

import javax.enterprise.inject.Typed;

@Typed(Bean1A.class)
@MyBinding(type="B")
public class Bean1A extends Bean1 {

}
