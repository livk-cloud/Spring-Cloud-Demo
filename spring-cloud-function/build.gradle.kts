dependencies {
    implementation(project(":spring-common"))
    implementation("org.springframework.cloud:spring-cloud-starter-function-web")
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
