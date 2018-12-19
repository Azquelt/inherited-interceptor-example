package az.inheritedinterceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
@MyBinding(type="B")
public class InterceptorB {
    
    @AroundInvoke
    public Object interceptMethod(InvocationContext context) throws Exception {
        return context.proceed() + " + InterceptorB";
    }
    
}
