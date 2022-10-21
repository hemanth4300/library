// This file was automatically generated by the Soy compiler.
// Please don't edit this file by hand.
// source: src/main/resources/com/google/phonenumbers/demo/result.soy

package com.google.phonenumbers.demo.template;


/**
 * Wrapper class containing {@link com.google.template.soy.data.SoyTemplate} builders for each
 * template in: result.soy.
 */
@javax.annotation.Generated("com.google.template.soy.SoyParseInfoGenerator")
public final class ResultTemplates {

  /** A map of filepath to symbol used for CSS resolution on server edit-refresh. */
  private static final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> __PROVIDED_CSS_MAP__ =   com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.String>of();

  /** A list of provided symbols used for css validation on edit refresh. */
  private static final com.google.common.collect.ImmutableList<java.lang.String> __PROVIDED_CSS__ =   com.google.common.collect.ImmutableList.<java.lang.String>of();

  /** Template params for com.google.phonenumbers.demo.singleNumber.singleNumber. */
  public static final class SingleNumber extends com.google.template.soy.data.BaseSoyTemplateImpl {

    private static final java.lang.String __NAME__ = "com.google.phonenumbers.demo.singleNumber.singleNumber";

    /** Wraps a ListenableFuture<SingleNumber> as a SoyTemplate.AsyncWrapper<SingleNumber> */
    public static com.google.template.soy.data.SoyTemplate.AsyncWrapper<SingleNumber> wrapFuture(com.google.common.util.concurrent.ListenableFuture<SingleNumber> paramsFuture) {
      return new com.google.template.soy.data.SoyTemplate.AsyncWrapper<>(__NAME__, paramsFuture);
    }

    private SingleNumber(com.google.common.collect.ImmutableMap<java.lang.String, com.google.template.soy.data.SoyValueProvider> data) {
      super(data);
    }

    @java.lang.Override
    public final java.lang.String getTemplateName() {
      return __NAME__;
    }

    /** Creates a new Builder instance. */
    public static Builder builder() {
      return new Builder();
    }

    /** {@param phoneNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        PHONE_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "phoneNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param defaultCountry} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        DEFAULT_COUNTRY =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "defaultCountry",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param geocodingLocale} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        GEOCODING_LOCALE =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "geocodingLocale",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param countryCode} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Long>
        COUNTRY_CODE =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "countryCode",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Long.class));

    /** {@param nationalNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Long>
        NATIONAL_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "nationalNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Long.class));

    /** {@param extension} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        EXTENSION =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "extension",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param countryCodeSource} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        COUNTRY_CODE_SOURCE =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "countryCodeSource",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param italianLeadingZero} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        ITALIAN_LEADING_ZERO =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "italianLeadingZero",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param rawInput} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        RAW_INPUT =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "rawInput",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param isPossibleNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_POSSIBLE_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isPossibleNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param isValidNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_VALID_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isValidNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param isValidNumberForRegion} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_VALID_NUMBER_FOR_REGION =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isValidNumberForRegion",
                /* required= */ false,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param phoneNumberRegion} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        PHONE_NUMBER_REGION =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "phoneNumberRegion",
                /* required= */ false,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param numberType} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        NUMBER_TYPE =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "numberType",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param validationResult} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        VALIDATION_RESULT =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "validationResult",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param isPossibleShortNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_POSSIBLE_SHORT_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isPossibleShortNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param isValidShortNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_VALID_SHORT_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isValidShortNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param isPossibleShortNumberForRegion} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_POSSIBLE_SHORT_NUMBER_FOR_REGION =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isPossibleShortNumberForRegion",
                /* required= */ false,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param isValidShortNumberForRegion} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Boolean>
        IS_VALID_SHORT_NUMBER_FOR_REGION =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "isValidShortNumberForRegion",
                /* required= */ false,
                com.google.common.reflect.TypeToken.of(java.lang.Boolean.class));

    /** {@param e164Format} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        E_164_FORMAT =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "e164Format",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param originalFormat} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        ORIGINAL_FORMAT =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "originalFormat",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param nationalFormat} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        NATIONAL_FORMAT =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "nationalFormat",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param internationalFormat} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        INTERNATIONAL_FORMAT =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "internationalFormat",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param outOfCountryFormatFromUs} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        OUT_OF_COUNTRY_FORMAT_FROM_US =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "outOfCountryFormatFromUs",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param outOfCountryFormatFromCh} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        OUT_OF_COUNTRY_FORMAT_FROM_CH =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "outOfCountryFormatFromCh",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param rows} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Iterable<? extends java.util.Collection<java.lang.String>>>
        ROWS =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "rows",
                /* required= */ true,
                new com.google.common.reflect.TypeToken<java.lang.Iterable<? extends java.util.Collection<java.lang.String>>>() {});

    /** {@param descriptionForNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        DESCRIPTION_FOR_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "descriptionForNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param timeZonesForNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        TIME_ZONES_FOR_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "timeZonesForNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param nameForNumber} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        NAME_FOR_NUMBER =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "nameForNumber",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param newIssueLink} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        NEW_ISSUE_LINK =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "newIssueLink",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@param guidelinesLink} */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.String>
        GUIDELINES_LINK =
            com.google.template.soy.data.SoyTemplateParam.standard(
                "guidelinesLink",
                /* required= */ true,
                com.google.common.reflect.TypeToken.of(java.lang.String.class));

    /** {@inject csp_style_nonce} Created by ContentSecurityPolicyNonceInjectionPass. */
    public static final com.google.template.soy.data.SoyTemplateParam<java.lang.Object>
        CSP_STYLE_NONCE =
            com.google.template.soy.data.SoyTemplateParam.injected(
                "csp_style_nonce",
                /* required= */ false,
                com.google.common.reflect.TypeToken.of(java.lang.Object.class));

    private static final com.google.common.collect.ImmutableSet<com.google.template.soy.data.SoyTemplateParam<?>> __PARAMS__ = com.google.common.collect.ImmutableSet.of(
        PHONE_NUMBER,
        DEFAULT_COUNTRY,
        GEOCODING_LOCALE,
        COUNTRY_CODE,
        NATIONAL_NUMBER,
        EXTENSION,
        COUNTRY_CODE_SOURCE,
        ITALIAN_LEADING_ZERO,
        RAW_INPUT,
        IS_POSSIBLE_NUMBER,
        IS_VALID_NUMBER,
        IS_VALID_NUMBER_FOR_REGION,
        PHONE_NUMBER_REGION,
        NUMBER_TYPE,
        VALIDATION_RESULT,
        IS_POSSIBLE_SHORT_NUMBER,
        IS_VALID_SHORT_NUMBER,
        IS_POSSIBLE_SHORT_NUMBER_FOR_REGION,
        IS_VALID_SHORT_NUMBER_FOR_REGION,
        E_164_FORMAT,
        ORIGINAL_FORMAT,
        NATIONAL_FORMAT,
        INTERNATIONAL_FORMAT,
        OUT_OF_COUNTRY_FORMAT_FROM_US,
        OUT_OF_COUNTRY_FORMAT_FROM_CH,
        ROWS,
        DESCRIPTION_FOR_NUMBER,
        TIME_ZONES_FOR_NUMBER,
        NAME_FOR_NUMBER,
        NEW_ISSUE_LINK,
        GUIDELINES_LINK);

    public static final class Builder extends com.google.template.soy.data.BaseSoyTemplateImpl.AbstractBuilder<Builder, SingleNumber> {

      private Builder() {
        super(31);
      }

      @java.lang.Override
      protected com.google.common.collect.ImmutableSet<com.google.template.soy.data.SoyTemplateParam<?>> allParams() {
        return __PARAMS__;
      }

      @java.lang.Override
      protected SingleNumber buildInternal(com.google.common.collect.ImmutableMap<java.lang.String, com.google.template.soy.data.SoyValueProvider> data) {
        return new SingleNumber(data);
      }

      /** Sets phoneNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setPhoneNumber(java.lang.String value) {
        return setParamInternal(PHONE_NUMBER, asString(value));
      }

      /** Future compatible version of {@link #setPhoneNumber(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setPhoneNumberFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(PHONE_NUMBER, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets defaultCountry. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setDefaultCountry(java.lang.String value) {
        return setParamInternal(DEFAULT_COUNTRY, asString(value));
      }

      /** Future compatible version of {@link #setDefaultCountry(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setDefaultCountryFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(DEFAULT_COUNTRY, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets geocodingLocale. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setGeocodingLocale(java.lang.String value) {
        return setParamInternal(GEOCODING_LOCALE, asString(value));
      }

      /** Future compatible version of {@link #setGeocodingLocale(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setGeocodingLocaleFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(GEOCODING_LOCALE, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets countryCode. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setCountryCode(long value) {
        return setParamInternal(COUNTRY_CODE, asInt(value));
      }

      /** Future compatible version of {@link #setCountryCode(long)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setCountryCodeFuture(java.util.concurrent.Future<? extends java.lang.Number> future) {
        return setParamInternal(COUNTRY_CODE, asFuture(future, AbstractBuilder::asBoxedInt));
      }

      /** Sets nationalNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNationalNumber(long value) {
        return setParamInternal(NATIONAL_NUMBER, asInt(value));
      }

      /** Future compatible version of {@link #setNationalNumber(long)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNationalNumberFuture(java.util.concurrent.Future<? extends java.lang.Number> future) {
        return setParamInternal(NATIONAL_NUMBER, asFuture(future, AbstractBuilder::asBoxedInt));
      }

      /** Sets extension. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setExtension(java.lang.String value) {
        return setParamInternal(EXTENSION, asString(value));
      }

      /** Future compatible version of {@link #setExtension(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setExtensionFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(EXTENSION, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets countryCodeSource. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setCountryCodeSource(java.lang.String value) {
        return setParamInternal(COUNTRY_CODE_SOURCE, asString(value));
      }

      /** Future compatible version of {@link #setCountryCodeSource(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setCountryCodeSourceFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(COUNTRY_CODE_SOURCE, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets italianLeadingZero. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setItalianLeadingZero(boolean value) {
        return setParamInternal(ITALIAN_LEADING_ZERO, asBool(value));
      }

      /** Future compatible version of {@link #setItalianLeadingZero(boolean)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setItalianLeadingZeroFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(ITALIAN_LEADING_ZERO, asFuture(future, AbstractBuilder::asBool));
      }

      /** Sets rawInput. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setRawInput(java.lang.String value) {
        return setParamInternal(RAW_INPUT, asString(value));
      }

      /** Future compatible version of {@link #setRawInput(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setRawInputFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(RAW_INPUT, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets isPossibleNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsPossibleNumber(boolean value) {
        return setParamInternal(IS_POSSIBLE_NUMBER, asBool(value));
      }

      /** Future compatible version of {@link #setIsPossibleNumber(boolean)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsPossibleNumberFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_POSSIBLE_NUMBER, asFuture(future, AbstractBuilder::asBool));
      }

      /** Sets isValidNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidNumber(boolean value) {
        return setParamInternal(IS_VALID_NUMBER, asBool(value));
      }

      /** Future compatible version of {@link #setIsValidNumber(boolean)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidNumberFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_VALID_NUMBER, asFuture(future, AbstractBuilder::asBool));
      }

      /** Sets isValidNumberForRegion. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidNumberForRegion(@javax.annotation.Nullable java.lang.Boolean value) {
        return setParamInternal(IS_VALID_NUMBER_FOR_REGION, asNullableBool(value));
      }

      /** Future compatible version of {@link #setIsValidNumberForRegion(java.lang.Boolean)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidNumberForRegionFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_VALID_NUMBER_FOR_REGION, asFuture(future, AbstractBuilder::asNullableBool));
      }

      /** Sets phoneNumberRegion. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setPhoneNumberRegion(@javax.annotation.Nullable java.lang.String value) {
        return setParamInternal(PHONE_NUMBER_REGION, asNullableString(value));
      }

      /** Future compatible version of {@link #setPhoneNumberRegion(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setPhoneNumberRegionFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(PHONE_NUMBER_REGION, asFuture(future, AbstractBuilder::asNullableString));
      }

      /** Sets numberType. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNumberType(java.lang.String value) {
        return setParamInternal(NUMBER_TYPE, asString(value));
      }

      /** Future compatible version of {@link #setNumberType(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNumberTypeFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(NUMBER_TYPE, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets validationResult. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setValidationResult(java.lang.String value) {
        return setParamInternal(VALIDATION_RESULT, asString(value));
      }

      /** Future compatible version of {@link #setValidationResult(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setValidationResultFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(VALIDATION_RESULT, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets isPossibleShortNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsPossibleShortNumber(boolean value) {
        return setParamInternal(IS_POSSIBLE_SHORT_NUMBER, asBool(value));
      }

      /** Future compatible version of {@link #setIsPossibleShortNumber(boolean)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsPossibleShortNumberFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_POSSIBLE_SHORT_NUMBER, asFuture(future, AbstractBuilder::asBool));
      }

      /** Sets isValidShortNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidShortNumber(boolean value) {
        return setParamInternal(IS_VALID_SHORT_NUMBER, asBool(value));
      }

      /** Future compatible version of {@link #setIsValidShortNumber(boolean)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidShortNumberFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_VALID_SHORT_NUMBER, asFuture(future, AbstractBuilder::asBool));
      }

      /** Sets isPossibleShortNumberForRegion. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsPossibleShortNumberForRegion(@javax.annotation.Nullable java.lang.Boolean value) {
        return setParamInternal(IS_POSSIBLE_SHORT_NUMBER_FOR_REGION, asNullableBool(value));
      }

      /**
       * Future compatible version of {@link
       * #setIsPossibleShortNumberForRegion(java.lang.Boolean)}.
       */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsPossibleShortNumberForRegionFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_POSSIBLE_SHORT_NUMBER_FOR_REGION, asFuture(future, AbstractBuilder::asNullableBool));
      }

      /** Sets isValidShortNumberForRegion. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidShortNumberForRegion(@javax.annotation.Nullable java.lang.Boolean value) {
        return setParamInternal(IS_VALID_SHORT_NUMBER_FOR_REGION, asNullableBool(value));
      }

      /**
       * Future compatible version of {@link
       * #setIsValidShortNumberForRegion(java.lang.Boolean)}.
       */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setIsValidShortNumberForRegionFuture(java.util.concurrent.Future<java.lang.Boolean> future) {
        return setParamInternal(IS_VALID_SHORT_NUMBER_FOR_REGION, asFuture(future, AbstractBuilder::asNullableBool));
      }

      /** Sets e164Format. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setE164Format(java.lang.String value) {
        return setParamInternal(E_164_FORMAT, asString(value));
      }

      /** Future compatible version of {@link #setE164Format(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setE164FormatFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(E_164_FORMAT, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets originalFormat. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setOriginalFormat(java.lang.String value) {
        return setParamInternal(ORIGINAL_FORMAT, asString(value));
      }

      /** Future compatible version of {@link #setOriginalFormat(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setOriginalFormatFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(ORIGINAL_FORMAT, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets nationalFormat. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNationalFormat(java.lang.String value) {
        return setParamInternal(NATIONAL_FORMAT, asString(value));
      }

      /** Future compatible version of {@link #setNationalFormat(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNationalFormatFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(NATIONAL_FORMAT, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets internationalFormat. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setInternationalFormat(java.lang.String value) {
        return setParamInternal(INTERNATIONAL_FORMAT, asString(value));
      }

      /** Future compatible version of {@link #setInternationalFormat(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setInternationalFormatFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(INTERNATIONAL_FORMAT, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets outOfCountryFormatFromUs. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setOutOfCountryFormatFromUs(java.lang.String value) {
        return setParamInternal(OUT_OF_COUNTRY_FORMAT_FROM_US, asString(value));
      }

      /** Future compatible version of {@link #setOutOfCountryFormatFromUs(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setOutOfCountryFormatFromUsFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(OUT_OF_COUNTRY_FORMAT_FROM_US, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets outOfCountryFormatFromCh. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setOutOfCountryFormatFromCh(java.lang.String value) {
        return setParamInternal(OUT_OF_COUNTRY_FORMAT_FROM_CH, asString(value));
      }

      /** Future compatible version of {@link #setOutOfCountryFormatFromCh(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setOutOfCountryFormatFromChFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(OUT_OF_COUNTRY_FORMAT_FROM_CH, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets rows. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setRows(java.lang.Iterable<? extends java.util.Collection<java.lang.String>> value) {
        return setParamInternal(ROWS, asList(value, v -> asList(v, AbstractBuilder::asString)));
      }

      /** Future compatible version of {@link #setRows(java.lang.Iterable>)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setRowsFuture(java.util.concurrent.Future<? extends java.util.Collection<? extends java.util.Collection<java.lang.String>>> future) {
        return setParamInternal(ROWS, asFuture(future, v -> asList(v, v1 -> asList(v1, AbstractBuilder::asString))));
      }

      /** Sets descriptionForNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setDescriptionForNumber(java.lang.String value) {
        return setParamInternal(DESCRIPTION_FOR_NUMBER, asString(value));
      }

      /** Future compatible version of {@link #setDescriptionForNumber(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setDescriptionForNumberFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(DESCRIPTION_FOR_NUMBER, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets timeZonesForNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setTimeZonesForNumber(java.lang.String value) {
        return setParamInternal(TIME_ZONES_FOR_NUMBER, asString(value));
      }

      /** Future compatible version of {@link #setTimeZonesForNumber(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setTimeZonesForNumberFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(TIME_ZONES_FOR_NUMBER, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets nameForNumber. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNameForNumber(java.lang.String value) {
        return setParamInternal(NAME_FOR_NUMBER, asString(value));
      }

      /** Future compatible version of {@link #setNameForNumber(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNameForNumberFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(NAME_FOR_NUMBER, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets newIssueLink. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNewIssueLink(java.lang.String value) {
        return setParamInternal(NEW_ISSUE_LINK, asString(value));
      }

      /** Future compatible version of {@link #setNewIssueLink(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setNewIssueLinkFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(NEW_ISSUE_LINK, asFuture(future, AbstractBuilder::asString));
      }

      /** Sets guidelinesLink. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setGuidelinesLink(java.lang.String value) {
        return setParamInternal(GUIDELINES_LINK, asString(value));
      }

      /** Future compatible version of {@link #setGuidelinesLink(java.lang.String)}. */
      @com.google.errorprone.annotations.CanIgnoreReturnValue
      public Builder setGuidelinesLinkFuture(java.util.concurrent.Future<java.lang.String> future) {
        return setParamInternal(GUIDELINES_LINK, asFuture(future, AbstractBuilder::asString));
      }

    }
  }

}
