package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Ramesh Fadatare
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                AppContext.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
            return new Class[] {
                    WebMvcConfig.class
            };
    }
}
