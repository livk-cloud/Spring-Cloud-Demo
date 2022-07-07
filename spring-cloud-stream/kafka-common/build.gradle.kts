dependencies {
    api(project(":spring-common"))
    api("org.springframework.boot:spring-boot-starter-web")
    api("org.springframework.cloud:spring-cloud-starter-stream-kafka")
    api("org.springframework.cloud:spring-cloud-starter-consul-discovery")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
