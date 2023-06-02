
plugins {
    id("app.scircle.java-application-conventions")
}

dependencies {
    implementation(project(":security"))
    implementation(project(":services"))
    implementation(project(":domain"))
}

application {
    // Define the main class for the application.
    mainClass.set("app.scircle.app.App")
}
