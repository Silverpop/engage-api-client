package com.silverpop.api.client;

public class ApiAnnotationUtility<T> {
	private Class<T> typeOfAnnotationClass;
	
	public ApiAnnotationUtility(Class<T> typeOfClass){
		this.typeOfAnnotationClass = typeOfClass;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T getApiProperties(ApiCommand clazz) {
		Class aClass = clazz.getClass();
		T annotation = (T) aClass.getAnnotation(typeOfAnnotationClass);
		if(annotation == null) {
				throw new ApiException(typeOfAnnotationClass.getSimpleName() + " annotation missing from command,  command is unsupported by ApiClient.");
		}
		return annotation;
	}
}