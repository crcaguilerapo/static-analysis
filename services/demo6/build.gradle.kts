plugins {
    id("java")
    id("org.sonarqube") version "4.3.1.3277"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

sonar {
    properties {
        property("sonar.projectKey", "crcaguilerapo_demo6")
        property("sonar.organization", "crcaguilerapo")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}