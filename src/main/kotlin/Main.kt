import properties.ApiProperties

fun main(args: Array<String>){
//    val props = ApiProperties().props
//    println("props: $props")
//    val apis = (props["apis"] as Map<String, Any>)
//    println("apis: $apis")
//    val kakao = apis["kakao"] as Map<String, Any>
//    println("kakao: $kakao")
//    println("url: ${kakao["url"]}")
//    println("subUrls: ${kakao["subUrls"]}")
    val kakaoProps = ApiProperties("kakao")
    println("kakao url: ${kakaoProps.getUrl()}")
    println("kakao address subUrl: ${kakaoProps.getSubUrl("address")}")
    println("kakao header key: ${kakaoProps.getHeader("key1")}")
    println("kakao header abc: ${kakaoProps.getHeader("abc")}")
}