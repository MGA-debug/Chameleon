Проект содержит популярные архетипы для старта проектов:

* **rest-cucumber** - стартовый проект для тестирования Rest API
* **selenium-cucumber-pageobject** - стартовый проект для тестирования Web-приложений с использованием Selenium + Cucumber и паттерна PageObject с описанием элементов в классах
* **selenium-cucumber-repository** - стартовый проект для тестирования Web-приложений с использованием Selenium + Cucumber и паттерна PageObject с описанием элементов в XML репозитории
* **selenium-pageobject** - стартовый проект для тестирования Web-приложений с использованием Selenium и паттерна PageObject  с описанием элементов в классах
* **selenium-pageobject-repository** - стартовый проект для тестирования Web-приложений с использованием Selenium и паттерна PageObject с описанием элементов в XML репозитории
*  **selenium-cucumber-base-features** - стартовый проект для тестирования Web-приложений с использованием Selenium + Cucumber, возможностью параллельного выполнения и записи видео

Сгенерировать архетип модуля: mvn archetype:create-from-project -pl selenium-pageobject -am  

Добавление архетипа в локальный репозиторий: mvn install:install-file -Dfile=chameleon-archetype-archetype-1.0-SNAPSHOT.jar -DgroupId=com.aplana.chameleon -DartifactId=selenium-pageobject -Dversion=1.0-SNAPSHOT -Dpackaging=jar

Генерация проекта из архетипа: mvn archetype:generate -DarchetypeGroupId=com.aplana.chameleon -DarchetypeArtifactId=selenium-pageobject -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.aplana.chameleon -DartifactId=chameleon-selenium -Dversion=1.0-SNAPSHOT

Публикация архетипа: mvn deploy:deploy-file -Dfile=selenium-pageobject-archetype-1.0-SNAPSHOT.jar -DrepositoryId=aplana-chameleon -Durl=http://jenkins.aplana.com:8081/repository/aplana-chameleon -DgroupId=com.aplana.chameleon -DartifactId=selenium-pageobject -Dversion=1.0-SNAPSHOT
