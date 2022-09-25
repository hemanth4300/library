package com.google.demo.helper;

import com.google.template.soy.SoyFileSet;
import com.google.template.soy.data.SoyTemplate;
import com.google.template.soy.tofu.SoyTofu;

public class TemplateHelper {

  public static String templateToString(
      String template, String namespace, SoyTemplate soyTemplate) {
    SoyFileSet sfs =
        SoyFileSet.builder().add(TemplateHelper.class.getResource("../" + template)).build();
    SoyTofu tofu = sfs.compileToTofu();
    // For convenience, create another SoyTofu object that has a
    // namespace specified, so you can pass partial template names to
    // the newRenderer() method.
    SoyTofu simpleTofu = tofu.forNamespace(namespace);
    return simpleTofu.newRenderer(soyTemplate).render();
  }
}
