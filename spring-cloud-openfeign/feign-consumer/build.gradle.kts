dependencies {
    implementation(project(":spring-cloud-openfeign:feign-provider:feign-provider-api"))
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
