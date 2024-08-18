plugins {
    id("java")
}

group = "team.idealstate.test"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.javadoc {
    options {
        encoding("UTF-8")
        charset("UTF-8")
        jFlags("-Dfile.encoding=$encoding")
    }
}