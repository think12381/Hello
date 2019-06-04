####################

create hello world test project

1 @RestController 使用request method
2 @RequestMapping 接受HTTP的request  @RequestMapping("/") 如果遇到/ 就會呼叫

####################

topic simple MVC
1
@RequestParam 接收前端的參數
@RequestParam(value="name",required = false,defaultValue = "world"
URL ex value get name , value 預設 world

2 set thymeleaf Lib
add in build.gradle dependencies
compile("org.springframework.boot:spring-boot-starter-thymeleaf")

3 add html
  templates
  controller return "greeting" connect greeting.html  return greeting must mapp greeting.html
  <p th:text = "'hello123,'+${name}+'!'"> mapping RequestParam
  1 hello123 <=> value = name => name = "hello123"
  2 ${name} => 預設是world456 defaultValue
