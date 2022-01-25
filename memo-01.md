### @Controller
- 전통적인 Spring MVC 컨트롤러인 @Controller 어노테이션은 주로 View를 반환하기 위해 사용된다.

1. Client는 URI 형식으로 웹 서비스에 요청
2. Mapping되는 Handler와 Type을 찾는 DispatcherServlet 이 요청을 인터셉트
3. Controller가 요청을 처리한 후에 응답을 DispatcherServlet 으로 반환하고, DispatcherServlet 은 View 를 사용자에게 반환한다.

- @Controller 가 View 를 반환하기 위해서는 ViewResolver 가 사용되며, ViewResolver 설정에 맞게 View 를 찾아 렌더링 한다.

- 하지만 Data 를 반환해야 하는 경우도 있는데, 그럴 땐 @ResponseBdy 어노테이션을 활용한다.
- 이를 통해 @Controller 도 Json 형태의 데이터를 반환할 수 있다.

---
### @RestController


- @RestController 가 Data를 반환하기 위해서는 viewResolver 대신 HttpMessageConverter 가 동작한다.
- HttpMessageConverter 에는 여러 Converter 가 등록되어 있고, 반환해야 하는 데이터에 따라 사용되는 Converter 가 달라진다.
- 단순 문자열인 경우에는 StringHttpMessageConverter 가 사용되고 객체인 경우에는 MappingJackson2HttpMessageConverter가 사용되며 데이터 종류에 따라 서로 다른 컨버터가 작동함..
- Spring은 클라이언트의 Http Accept 헤더와 서버의 컨트롤러 반환 타입 정보 둘을 조합해서 적합한 HttpMessageConverter 를 선택하여 처리함


- SpringMVC Controller 에 @ResponseBody 가 추가된 것임
- Json 형태로 객체 데이터를 반환하는 것이 주 용도
- 
