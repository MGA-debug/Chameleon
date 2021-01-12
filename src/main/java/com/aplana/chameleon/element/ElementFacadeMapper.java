package com.aplana.chameleon.element;

import com.aplana.chameleon.definitions.repository.DefaultElementFacadeMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Здесь прописывается соответстве метаклассов (держат данные, прочитанные из XML)
 * и поведенческих классов (отвечающих за взаимодействие с интерфейсом).
 * Настраиваются новые метаклассы, отсутсвующие в хамелеоне. А такжеJSTextInput
 * переопределются поведенческие классы для существующих метаклассов (если требуетя кастомная реализация).
 */
@Component
@Primary
public class ElementFacadeMapper extends DefaultElementFacadeMapper {

	private static final Class[][] CLASS_PAIRS = {



	};

	@Override
	public String getFacadeClassName(Class aClass) {
		return Arrays.stream(CLASS_PAIRS)
			.filter((clazzPair) -> clazzPair[0] == aClass)
			.map((clazzPair) -> clazzPair[1].getPackage().getName() + "." + clazzPair[1].getSimpleName())
			.findFirst()
			.orElse(super.getFacadeClassName(aClass));
	}
}
