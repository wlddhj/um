package org.springside.modules.unit.web.struts2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springside.modules.test.spring.MockWebUtils;
import org.springside.modules.web.struts2.Struts2Utils;

public class Struts2UtilsTest extends Assert {

	@Test
	public void render() throws UnsupportedEncodingException {
		MockHttpServletResponse response = new MockHttpServletResponse();
		MockWebUtils.setResponseToStruts2(response);

		Struts2Utils.render("text/plain", "hello");
		assertEquals("text/plain;charset=UTF-8", response.getContentType());
		assertEquals("No-cache", response.getHeader("Pragma"));
		assertEquals("hello", response.getContentAsString());

		response = new MockHttpServletResponse();
		ServletActionContext.setResponse(response);
		Struts2Utils.render("text/plain", "hello", "encoding:GBK");
		assertEquals("text/plain;charset=GBK", response.getContentType());
		assertEquals("No-cache", response.getHeader("Pragma"));
		assertEquals("hello", response.getContentAsString());

		response = new MockHttpServletResponse();
		ServletActionContext.setResponse(response);
		Struts2Utils.render("text/plain", "hello", "no-cache:false");
		assertEquals("text/plain;charset=UTF-8", response.getContentType());
		assertEquals(null, response.getHeader("Pragma"));
		assertEquals("hello", response.getContentAsString());

		response = new MockHttpServletResponse();
		ServletActionContext.setResponse(response);
		Struts2Utils.render("text/plain", "hello", "encoding:GBK", "no-cache:false");
		assertEquals("text/plain;charset=GBK", response.getContentType());
		assertEquals(null, response.getHeader("Pragma"));
		assertEquals("hello", response.getContentAsString());
	}

	@Test
	@SuppressWarnings("unchecked")
	public void renderJson() throws UnsupportedEncodingException {
		MockHttpServletResponse response = new MockHttpServletResponse();
		MockWebUtils.setResponseToStruts2(response);

		//Map
		Map map = new LinkedHashMap();
		map.put("age", 10);
		map.put("name", "foo");
		Struts2Utils.renderJson(map);
		assertEquals("{\"age\":10,\"name\":\"foo\"}", response.getContentAsString());

		//Object
		response = new MockHttpServletResponse();
		ServletActionContext.setResponse(response);
		Object object = new TestBean();
		Struts2Utils.renderJson(object);
		assertEquals("{\"age\":10,\"name\":\"foo\"}", response.getContentAsString());

		//Array
		response = new MockHttpServletResponse();
		ServletActionContext.setResponse(response);
		TestBean[] array = { new TestBean(), new TestBean() };
		Struts2Utils.renderJson(array);
		assertEquals("[{\"age\":10,\"name\":\"foo\"},{\"age\":10,\"name\":\"foo\"}]", response.getContentAsString());

		//Collection
		response = new MockHttpServletResponse();
		ServletActionContext.setResponse(response);
		List<TestBean> list = new ArrayList<TestBean>();
		list.add(new TestBean());
		list.add(new TestBean());

		Struts2Utils.renderJson(list);
		assertEquals("[{\"age\":10,\"name\":\"foo\"},{\"age\":10,\"name\":\"foo\"}]", response.getContentAsString());
	}

	@Test
	public void renderJsonP() throws UnsupportedEncodingException {
		MockHttpServletResponse response = new MockHttpServletResponse();
		MockWebUtils.setResponseToStruts2(response);

		Map<String, String> map = new HashMap<String, String>();
		map.put("html", "<p>helloworld</p>");
		Struts2Utils.renderJsonp("callback", map, "no-cache:true");
		assertEquals("callback({\"html\":\"<p>helloworld<\\/p>\"});", response.getContentAsString());
	}

	public class TestBean {
		int age = 10;
		String name = "foo";

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
