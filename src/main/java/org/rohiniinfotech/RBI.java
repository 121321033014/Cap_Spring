package org.rohiniinfotech;

//after creating interfaces go to pom.xml file and search for maven repository in the google
//click on this url https://mvnrepository.com/artifact/org.springframework/spring-context/6.1.0 select the given text
// and paste it in the pom.xml file by adding dependency tag in it before the end of the project tag
public interface RBI {
    public void withdraw();
    public void deposit();
    public void internetbanking();
    public void loan();

    public default void goldloan() {

    }
}
