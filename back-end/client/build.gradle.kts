import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    application
    kotlin("jvm") version "1.6.21"
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.6.21"
}


java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17
group = "ru.nino"
version = "0.0.1"

repositories {
    mavenCentral()
}


application {
    applicationName = "client-docker"
    base.archivesName.set("client.app")
    mainClass.set("ru.nino.client.ClientApplicationKt")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

//    database
    implementation(project(":l-data-base"))
    implementation("org.postgresql:postgresql:42.3.5")

//    swagger
    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.9")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.9")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.9")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

//    GraphQL
    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:12.0.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.graphql-java-kickstart:graphql-spring-boot-starter-test:12.0.0")

}

//tasks.withType<KotlinCompile> {
//    kotlinOptions {
//        freeCompilerArgs = listOf("-Xjsr305=strict")
//        jvmTarget = "17"
//    }
//}
//
//tasks.withType<Test> {
//    useJUnitPlatform()
//    org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType.jvm
//
//    javaVersion = "17"
//
//
//}