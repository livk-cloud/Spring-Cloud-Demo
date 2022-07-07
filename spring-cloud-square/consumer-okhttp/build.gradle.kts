dependencies {
    implementation(project(":spring-cloud-square:square-common"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-square-okhttp")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
