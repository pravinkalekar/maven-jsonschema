Simple JSON Schema POJO Creation Application 

It converts JSON Schema to Java classes using Maven Plugin `jsonschema2pojo-maven-plugin`
The generated types depend on Commons Lang library (`commons-lang3`) for equals, hashCode and toString.

Run `mvn generate-sources` goal to generate the java classes.

POJOs are created in `target/java-gen` folder by default.

If you want to generate POJOs from JSON rather than JSON schema, add
```<sourceType>json</sourceType>``` in the Plugin configuration.

If you want to generate POJOs using the Builder pattern, add 
```<generateBuilders>true</generateBuilders>``` in the Plugin configuration.

