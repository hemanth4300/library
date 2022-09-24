package example;


@javax.annotation.Generated("com.google.template.soy.SoyParseInfoGenerator")
public final class SimpleTemplates {


  private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> __PROVIDED_CSS_MAP__ = com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.String>of();

  private static final com.google.common.collect.ImmutableList<java.lang.String> __PROVIDED_CSS__ = com.google.common.collect.ImmutableList.<java.lang.String>of();


  public static final class HelloWorld extends com.google.template.soy.data.BaseSoyTemplateImpl {


    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        WELCOME_TITLE =
        com.google.template.soy.data.SoyTemplateParam.standard(
            "welcomeTitle",
            /* required= */ true,
            com.google.common.reflect.TypeToken.of(java.lang.String.class));

    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Object>
        CSP_STYLE_NONCE =
        com.google.template.soy.data.SoyTemplateParam.injected(
            "csp_style_nonce",
            /* required= */ false,
            com.google.common.reflect.TypeToken.of(java.lang.Object.class));
    private static final java.lang.String __NAME__ = "examples.simple.helloWorld";
    private static final com.google.common.collect.ImmutableSet<com.google.template.soy.data.SoyTemplateParam<?>> __PARAMS__ = com.google.common.collect.ImmutableSet.of(
        WELCOME_TITLE);

    private HelloWorld(
        com.google.common.collect.ImmutableMap<java.lang.String, com.google.template.soy.data.SoyValueProvider> data) {
      super(data);
    }


    public static com.google.template.soy.data.SoyTemplate.AsyncWrapper<HelloWorld> wrapFuture(
        com.google.common.util.concurrent.ListenableFuture<HelloWorld> paramsFuture) {
      return new com.google.template.soy.data.SoyTemplate.AsyncWrapper<>(__NAME__, paramsFuture);
    }


    public static Builder builder() {
      return new Builder();
    }

    @java.lang.Override
    public final java.lang.String getTemplateName() {
      return __NAME__;
    }

    public static final class Builder extends
        com.google.template.soy.data.BaseSoyTemplateImpl.AbstractBuilder<Builder, HelloWorld> {

      private Builder() {
        super(1);
      }

      @java.lang.Override
      protected com.google.common.collect.ImmutableSet<com.google.template.soy.data.SoyTemplateParam<?>> allParams() {
        return __PARAMS__;
      }

      @java.lang.Override
      protected HelloWorld buildInternal(
          com.google.common.collect.ImmutableMap<java.lang.String, com.google.template.soy.data.SoyValueProvider> data) {
        return new HelloWorld(data);
      }


      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setWelcomeTitle(java.lang.String value) {
        return setParamInternal(WELCOME_TITLE, asString(value));
      }


      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setWelcomeTitleFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(WELCOME_TITLE, asFuture(future, AbstractBuilder::asString));
      }

    }
  }

}
