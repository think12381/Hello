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

############################################

1 DI
  Configuration bean
  bean inject

2 CommandLineRunner <=>  public void run(String... args) throws Exception

3 delcare multi bean using Autowired
   @Autowired  @Qualifier("add")  <=> @Bean(name = "add")

4 use bean
  ApplicationContext context;
  Caculator Divcalu = context.getBean("div",Caculator.class);


#################################################################

1 restful API 回傳通常是json or xml

@RestController VS @Controller
@RestController = @Controller + @ResponseBody

2 add lombok to create setter getter... ex Message

3 Json format ex : {"id":888,"name":"Mark"}

  物件(object) ex Message 用大括號 { }

  key-value type  so
  id = 888
  name = mark


4 sigleton 概念上有點類似static 的概念 就是一但生成便所有的人皆可以存取
  prototype 每一次都會產生出一個instance 使用完就放在那