package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.lang.reflect.*;

public class ReflectionExample {
    private static final Logger logger = LogManager.getLogger(ReflectionExample.class);

    public static void testReflection(String className) {

        try {

            Class<?> reflectedClass = Class.forName(className);
            logger.info("Class name: " + reflectedClass.getName());
            logger.info("   ");

            Field[] fields = reflectedClass.getSuperclass().getDeclaredFields();
            for (Field field : fields) {
                logger.info("Field: " + field.getName());
                logger.info(" > Type: " + field.getType());
                logger.info(" > Modifier: " + Modifier.toString(field.getModifiers()));
            }
            logger.info("   ");

            Constructor<?> constructor = reflectedClass.getConstructor(String.class, boolean.class);
            logger.info("Constructor: " + constructor.getName());
            logger.info(" > Parameters types: ");
            for (Class<?> parameter : constructor.getParameterTypes()) {
                logger.info("      " + parameter.getName());
            }
            logger.info("   ");

            Method[] methods = reflectedClass.getDeclaredMethods();
            for (Method method : methods) {
                logger.info("Method: " + method.getName());
                logger.info(" > Return type: " + method.getReturnType());
                logger.info(" > Modifier: " + Modifier.toString(method.getModifiers()));
                logger.info(" > Parameters types: ");
                for (Class<?> parameter : method.getParameterTypes()) {
                    logger.info("      " + parameter.getName());
                }
            }
            logger.info("   ");

            logger.info("Object created using reflection... ");
            Constructor<?> objConstructor = reflectedClass.getConstructor(String.class, boolean.class);
            Object relic = objConstructor.newInstance("Golden Fleece", true);

            Method getNameMethod = reflectedClass.getMethod("getName");
            Object name = getNameMethod.invoke(relic);
            logger.info("Class: " + name.toString());

            Method showDescriptionMethod = reflectedClass.getMethod("showDescription", Logger.class);
            showDescriptionMethod.invoke(relic, logger);
            logger.info("   ");

        } catch(ClassNotFoundException classNFE) {
            logger.error("Class not found. " + classNFE.getMessage());
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
