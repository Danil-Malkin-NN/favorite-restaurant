import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17
group = "ru.nino"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    var latestVersion: String = "5.5.0"

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webflux")


//    implementation("com.graphql-java:graphql-java:18.0")
//    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:12.0.0")
//    implementation("com.graphql-java-kickstart:graphql-java-tools:12.1.0")


//    com.expediagroup
    implementation("com.expediagroup", "graphql-kotlin-spring-server", latestVersion)
    implementation("com.expediagroup", "graphql-kotlin-hooks-provider", latestVersion)
    implementation("com.expediagroup", "graphql-kotlin-schema-generator", latestVersion)
    implementation("com.expediagroup", "graphql-kotlin-schema-generator", latestVersion)

    implementation(project(":l-data-base"))
    implementation("org.postgresql:postgresql:42.3.6")


    testImplementation("org.springframework:spring-webflux")
//    testImplementation("com.graphql-java-kickstart:graphql-spring-boot-starter-test:12.0.0")
    testImplementation("org.springframework.graphql:spring-graphql-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
