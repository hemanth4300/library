package com.google.demo;


@javax.annotation.Generated("com.google.template.soy.SoyParseInfoGenerator")
public final class ResultTemplates {

  private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> __PROVIDED_CSS_MAP__ = com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.String>of();

  private static final com.google.common.collect.ImmutableList<java.lang.String> __PROVIDED_CSS__ = com.google.common.collect.ImmutableList.<java.lang.String>of();

  public static final class SingleNumber extends com.google.template.soy.data.BaseSoyTemplateImpl {

    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        PHONE_NUMBER =
        com.google.template.soy.data.SoyTemplateParam.standard(
            "phoneNumber",
            /* required= */ true,
            com.google.common.reflect.TypeToken.of(java.lang.String.class));
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        DEFAULT_COUNTRY =
        com.google.template.soy.data.SoyTemplateParam.standard(
            "defaultCountry",
            /* required= */ true,
            com.google.common.reflect.TypeToken.of(java.lang.String.class));
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        GEOCODING_LOCALE =
        com.google.template.soy.data.SoyTemplateParam.standard(
            "geocodingLocale",
            /* required= */ true,
            com.google.common.reflect.TypeToken.of(java.lang.String.class));
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Object>
        CSP_STYLE_NONCE =
        com.google.template.soy.data.SoyTemplateParam.injected(
            "csp_style_nonce",
            /* required= */ false,
            com.google.common.reflect.TypeToken.of(java.lang.Object.class));
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Object>
        CSP_NONCE =
        com.google.template.soy.data.SoyTemplateParam.injected(
            "csp_nonce",
            /* required= */ false,
            com.google.common.reflect.TypeToken.of(java.lang.Object.class));
    private static final java.lang.String __NAME__ = "demo.output.singleNumber";
    private static final com.google.common.collect.ImmutableSet<com.google.template.soy.data.SoyTemplateParam<?>> __PARAMS__ = com.google.common.collect.ImmutableSet.of(
        PHONE_NUMBER,
        DEFAULT_COUNTRY,
        GEOCODING_LOCALE);

    private SingleNumber(
        com.google.common.collect.ImmutableMap<java.lang.String, com.google.template.soy.data.SoyValueProvider> data) {
      super(data);
    }

    public static com.google.template.soy.data.SoyTemplate.AsyncWrapper<SingleNumber> wrapFuture(
        com.google.common.util.concurrent.ListenableFuture<SingleNumber> paramsFuture) {
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
        com.google.template.soy.data.BaseSoyTemplateImpl.AbstractBuilder<Builder, SingleNumber> {

      private Builder() {
        super(3);
      }

      @java.lang.Override
      protected com.google.common.collect.ImmutableSet<com.google.template.soy.data.SoyTemplateParam<?>> allParams() {
        return __PARAMS__;
      }

      @java.lang.Override
      protected SingleNumber buildInternal(
          com.google.common.collect.ImmutableMap<java.lang.String, com.google.template.soy.data.SoyValueProvider> data) {
        return new SingleNumber(data);
      }

      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setPhoneNumber(java.lang.String value) {
        return setParamInternal(PHONE_NUMBER, asString(value));
      }

      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setPhoneNumberFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(PHONE_NUMBER, asFuture(future, AbstractBuilder::asString));
      }

      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setDefaultCountry(java.lang.String value) {
        return setParamInternal(DEFAULT_COUNTRY, asString(value));
      }

      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setDefaultCountryFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(DEFAULT_COUNTRY, asFuture(future, AbstractBuilder::asString));
      }

      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setGeocodingLocale(java.lang.String value) {
        return setParamInternal(GEOCODING_LOCALE, asString(value));
      }

      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setGeocodingLocaleFuture(
          java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(GEOCODING_LOCALE, asFuture(future, AbstractBuilder::asString));
      }

    }
  }

}
