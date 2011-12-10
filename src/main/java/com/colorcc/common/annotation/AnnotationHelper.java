package com.colorcc.common.annotation;

public class AnnotationHelper {
	public static String getColorccMarshalAnnotationValue(Class<?> clazz) {
		// Class<T> entityClass = (Class<T>) ((ParameterizedType)
		// getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		ColorccMarshalAnnotation annotation = clazz.getAnnotation(ColorccMarshalAnnotation.class);
		if (annotation != null) {
			return annotation.value();
		} else {
			return null;
		}
	}
}
