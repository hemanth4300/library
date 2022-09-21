/*
 * Copyright (C) 2011 The Libphonenumber Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Shaopeng Jia
 */

package example;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.template.soy.SoyFileSet;
import com.google.template.soy.tofu.SoyTofu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A servlet that accepts requests that contain strings representing a phone number and a default
 * country, and responds with results from parsing, validating and formatting the number. The
 * default country is a two-letter region code representing the country that we are expecting the
 * number to be from.
 */
@SuppressWarnings("serial")
public class InputForm extends HttpServlet {


  /**
   * Handle the get request to get information about a number based on query parameters.
   */
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");
    resp.setCharacterEncoding(UTF_8.name());
    SoyFileSet sfs = SoyFileSet
        .builder()
        .add(InputForm.class.getResource("simple.soy"))
        .build();

    // helloWorld
    SoyTofu tofu = sfs.compileToTofu();
    // For convenience, create another SoyTofu object that has a
    // namespace specified, so you can pass partial template names to
    // the newRenderer() method.
    SoyTofu simpleTofu = tofu.forNamespace("examples.simple");
    // helloName
    Map<String, Object> data = new HashMap<>();
    data.put("name", "Phone Number Parser Demo");
    resp.getWriter().println(
        simpleTofu.newRenderer(".helloWorld").setData(data).render());
  }

}
