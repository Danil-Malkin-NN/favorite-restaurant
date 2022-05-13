rootProject.name = "back-end"

pluginManagement{
    val kotlinVersion: String by settings
    val openApiVersion: String by settings
    val serializationVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion
        id("org.openapi.generator") version openApiVersion
    }
}

include("client")
include("l-data-base")