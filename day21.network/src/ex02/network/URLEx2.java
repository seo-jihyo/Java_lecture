package ex02.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://www.google.com/search?q=kim+yuna&hl=ko&sxsrf=APwXEddkUSRZvv_cNDhr9r2PYNO2ungxBw%3A1682313737829&ei=CRJGZP2OMui42roPwbidwA4&gs_ssp=eJzj4tTP1TdIyk6uMjFg9OLIzsxVqCzNSwQARKoGjg&oq=%E3%85%8F%E3%85%91%E3%85%A1+%E3%85%9B%E3%85%95%E3%85%9C&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgAMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIQCC4QgAQQ3AQQ3QQQ3wQYAToKCAAQRxDWBBCwAzoECCMQJzoICC4QgAQQsQM6BwgAEIoFEEM6CwguEIAEELEDEIMBOgoIABCABBAUEIcCOggIABCABBCxAzoLCC4QgAQQsQMQ1AI6BwguENQCEAM6CwgAEIAEELEDEIMBOgcIIxDqAhAnOhQILhCABBCxAxCDARDHARDRAxDUAjoECC4QAzoECAAQAzoICC4QsQMQgAQ6DgguEIAEELEDEMcBENEDOgsILhCABBDHARCvAToTCC4QsQMQgAQQ3AQQ3gQQ4AQYAToOCC4QgwEQ1AIQsQMQgAQ6GQguEIMBENQCELEDEIAEENwEEN4EEN8EGAE6CwguEIMBELEDEIAEOhAILhCABBDcBBDeBBDfBBgBOgcIABCABBAKSgQIQRgAULEjWOdXYLlkaAJwAXgAgAFniAHwBpIBAzYuM5gBAKABAbABCsgBCsABAdoBBggBEAEYFA&sclient=gws-wiz-serp");

		//		https://www.google.com/ hostname
//		search?                 keyword 
//		q=kim+yuna              query = 검색어+검색어 (속성 = value)
//		&hl=ko&sxsrf=APwXEddkUSRZvv_cNDhr9r2PYNO2ungxBw%3A1682313737829  속성=값2&속성=값3
//		&ei=CRJGZP2OMui42roPwbidwA4
//		&gs_ssp=eJzj4tTP1TdIyk6uMjFg9OLIzsxVqCzNSwQARKoGjg&oq=%E3%85%8F%E3%85%91%E3%85%A1+%E3%85%9B%E3%85%95%E3%85%9C&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgAMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIQCC4QgAQQ3AQQ3QQQ3wQYAToKCAAQRxDWBBCwAzoECCMQJzoICC4QgAQQsQM6BwgAEIoFEEM6CwguEIAEELEDEIMBOgoIABCABBAUEIcCOggIABCABBCxAzoLCC4QgAQQsQMQ1AI6BwguENQCEAM6CwgAEIAEELEDEIMBOgcIIxDqAhAnOhQILhCABBCxAxCDARDHARDRAxDUAjoECC4QAzoECAAQAzoICC4QsQMQgAQ6DgguEIAEELEDEMcBENEDOgsILhCABBDHARCvAToTCC4QsQMQgAQQ3AQQ3gQQ4AQYAToOCC4QgwEQ1AIQsQMQgAQ6GQguEIMBENQCELEDEIAEENwEEN4EEN8EGAE6CwguEIMBELEDEIAEOhAILhCABBDcBBDeBBDfBBgBOgcIABCABBAKSgQIQRgAULEjWOdXYLlkaAJwAXgAgAFniAHwBpIBAzYuM5gBAKABAbABCsgBCsABAdoBBggBEAEYFA&sclient=gws-wiz-serp
		
//		URL이 갖고 있는 함수들 사용
		System.out.println("protocol: " + url.getProtocol());
		System.out.println("호스트와 포트: " + url.getAuthority());
		System.out.println("호스트: " + url.getHost());
		System.out.println("포트: " + url.getPort());
		System.out.println("경로: " + url.getPath());
		System.out.println("질의: " + url.getQuery());
		System.out.println("파일명: " + url.getFile());
		System.out.println("참조 : " + url.getRef());
		
	}
}
