plugins {
    id("adapter-config")
}

afterEvaluate {
    apply(plugin = "adapter-publish")
}

val libraryVersionName by extra("6.0.0.0")
val libraryArtifactId by extra("ogury-presage-adapter")

repositories {
    maven { url = uri("https://maven.ogury.co") }
}

