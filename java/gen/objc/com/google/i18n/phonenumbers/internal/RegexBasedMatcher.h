//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/andrefonseca/Documents/PodsFolders/libphonenumber/java/libphonenumber/src/main/java/com/google/i18n/phonenumbers/internal/RegexBasedMatcher.java
//

#include "J2ObjC_header.h"

#pragma push_macro("ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_INCLUDE_ALL")
#ifdef ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_RESTRICT
#define ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_INCLUDE_ALL 0
#else
#define ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_INCLUDE_ALL 1
#endif
#undef ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_RESTRICT

#if !defined (ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_) && (ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_INCLUDE_ALL || defined(ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_INCLUDE))
#define ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_

#define ComGoogleI18nPhonenumbersInternalMatcherApi_RESTRICT 1
#define ComGoogleI18nPhonenumbersInternalMatcherApi_INCLUDE 1
#include "com/google/i18n/phonenumbers/internal/MatcherApi.h"

@class ComGoogleI18nPhonenumbersNanoPhonemetadata_PhoneNumberDesc;

/*!
 @brief Implementation of the matcher API using the regular expressions in the PhoneNumberDesc
 proto message to match numbers.
 */
@interface ComGoogleI18nPhonenumbersInternalRegexBasedMatcher : NSObject < ComGoogleI18nPhonenumbersInternalMatcherApi >

#pragma mark Public

+ (id<ComGoogleI18nPhonenumbersInternalMatcherApi>)create;

- (jboolean)matchesNationalNumberWithNSString:(NSString *)nationalNumber
withComGoogleI18nPhonenumbersNanoPhonemetadata_PhoneNumberDesc:(ComGoogleI18nPhonenumbersNanoPhonemetadata_PhoneNumberDesc *)numberDesc
                                  withBoolean:(jboolean)allowPrefixMatch;

- (jboolean)matchesPossibleNumberWithNSString:(NSString *)nationalNumber
withComGoogleI18nPhonenumbersNanoPhonemetadata_PhoneNumberDesc:(ComGoogleI18nPhonenumbersNanoPhonemetadata_PhoneNumberDesc *)numberDesc;

@end

J2OBJC_EMPTY_STATIC_INIT(ComGoogleI18nPhonenumbersInternalRegexBasedMatcher)

FOUNDATION_EXPORT id<ComGoogleI18nPhonenumbersInternalMatcherApi> ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_create();

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleI18nPhonenumbersInternalRegexBasedMatcher)

#endif

#pragma pop_macro("ComGoogleI18nPhonenumbersInternalRegexBasedMatcher_INCLUDE_ALL")
