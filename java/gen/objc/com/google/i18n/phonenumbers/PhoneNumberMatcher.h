//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/andrefonseca/Documents/PodsFolders/libphonenumber/java/libphonenumber/src/main/java/com/google/i18n/phonenumbers/PhoneNumberMatcher.java
//

#include "J2ObjC_header.h"

#pragma push_macro("ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE_ALL")
#ifdef ComGoogleI18nPhonenumbersPhoneNumberMatcher_RESTRICT
#define ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE_ALL 0
#else
#define ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE_ALL 1
#endif
#undef ComGoogleI18nPhonenumbersPhoneNumberMatcher_RESTRICT

#if !defined (ComGoogleI18nPhonenumbersPhoneNumberMatcher_) && (ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE_ALL || defined(ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE))
#define ComGoogleI18nPhonenumbersPhoneNumberMatcher_

#define JavaUtilIterator_RESTRICT 1
#define JavaUtilIterator_INCLUDE 1
#include "java/util/Iterator.h"

@class ComGoogleI18nPhonenumbersPhoneNumberMatch;
@class ComGoogleI18nPhonenumbersPhoneNumberUtil;
@class ComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency;
@class ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber;
@class IOSObjectArray;
@class JavaLangStringBuilder;
@protocol ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker;
@protocol JavaLangCharSequence;

/*!
 @brief A stateful class that finds and extracts telephone numbers from text.
 Instances can be created using the factory methods in
 <code>PhoneNumberUtil</code>.
 <p>Vanity numbers (phone numbers using alphabetic digits such as <tt>1-800-SIX-FLAGS</tt> are
 not found.
 <p>This class is not thread-safe.
 */
@interface ComGoogleI18nPhonenumbersPhoneNumberMatcher : NSObject < JavaUtilIterator >

#pragma mark Public

- (jboolean)hasNext;

- (ComGoogleI18nPhonenumbersPhoneNumberMatch *)next;

/*!
 @brief Always throws <code>UnsupportedOperationException</code> as removal is not supported.
 */
- (void)remove;

#pragma mark Package-Private

/*!
 @brief Creates a new instance.
 See the factory methods in <code>PhoneNumberUtil</code> on how to obtain a
 new instance.
 @param util      the phone number util to use
 @param text      the character sequence that we will search, null for no text
 @param country   the country to assume for phone numbers not written in international format
 (with a leading plus, or with the international dialing prefix of the
 specified region). May be null or "ZZ" if only numbers with a
 leading plus should be considered.
 @param leniency  the leniency to use when evaluating candidate phone numbers
 @param maxTries  the maximum number of invalid numbers to try before giving up on the text.
 This is to cover degenerate cases where the text has a lot of false positives
 in it. Must be <code>>= 0</code>.
 */
- (instancetype)initWithComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util
                                        withJavaLangCharSequence:(id<JavaLangCharSequence>)text
                                                    withNSString:(NSString *)country
           withComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency:(ComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency *)leniency
                                                        withLong:(jlong)maxTries;

+ (jboolean)allNumberGroupsAreExactlyPresentWithComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util
                                    withComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                                               withJavaLangStringBuilder:(JavaLangStringBuilder *)normalizedCandidate
                                                                       withNSStringArray:(IOSObjectArray *)formattedNumberGroups;

+ (jboolean)allNumberGroupsRemainGroupedWithComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util
                                withComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                                           withJavaLangStringBuilder:(JavaLangStringBuilder *)normalizedCandidate
                                                                   withNSStringArray:(IOSObjectArray *)formattedNumberGroups;

+ (jboolean)checkNumberGroupingIsValidWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                                                              withNSString:(NSString *)candidate
                                              withComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util
                     withComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker:(id<ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker>)checker;

+ (jboolean)containsMoreThanOneSlashInNationalNumberWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                                                                            withNSString:(NSString *)candidate;

+ (jboolean)containsOnlyValidXCharsWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                                                           withNSString:(NSString *)candidate
                                           withComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util;

/*!
 @brief Helper method to determine if a character is a Latin-script letter or not.
 For our purposes,
 combining marks should also return true since we assume they have been added to a preceding
 Latin character.
 */
+ (jboolean)isLatinLetterWithChar:(jchar)letter;

+ (jboolean)isNationalPrefixPresentIfRequiredWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                                     withComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util;

@end

J2OBJC_STATIC_INIT(ComGoogleI18nPhonenumbersPhoneNumberMatcher)

FOUNDATION_EXPORT void ComGoogleI18nPhonenumbersPhoneNumberMatcher_initWithComGoogleI18nPhonenumbersPhoneNumberUtil_withJavaLangCharSequence_withNSString_withComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency_withLong_(ComGoogleI18nPhonenumbersPhoneNumberMatcher *self, ComGoogleI18nPhonenumbersPhoneNumberUtil *util, id<JavaLangCharSequence> text, NSString *country, ComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency *leniency, jlong maxTries);

FOUNDATION_EXPORT ComGoogleI18nPhonenumbersPhoneNumberMatcher *new_ComGoogleI18nPhonenumbersPhoneNumberMatcher_initWithComGoogleI18nPhonenumbersPhoneNumberUtil_withJavaLangCharSequence_withNSString_withComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency_withLong_(ComGoogleI18nPhonenumbersPhoneNumberUtil *util, id<JavaLangCharSequence> text, NSString *country, ComGoogleI18nPhonenumbersPhoneNumberUtil_Leniency *leniency, jlong maxTries) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_isLatinLetterWithChar_(jchar letter);

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_allNumberGroupsRemainGroupedWithComGoogleI18nPhonenumbersPhoneNumberUtil_withComGoogleI18nPhonenumbersPhonenumber_PhoneNumber_withJavaLangStringBuilder_withNSStringArray_(ComGoogleI18nPhonenumbersPhoneNumberUtil *util, ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *number, JavaLangStringBuilder *normalizedCandidate, IOSObjectArray *formattedNumberGroups);

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_allNumberGroupsAreExactlyPresentWithComGoogleI18nPhonenumbersPhoneNumberUtil_withComGoogleI18nPhonenumbersPhonenumber_PhoneNumber_withJavaLangStringBuilder_withNSStringArray_(ComGoogleI18nPhonenumbersPhoneNumberUtil *util, ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *number, JavaLangStringBuilder *normalizedCandidate, IOSObjectArray *formattedNumberGroups);

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_checkNumberGroupingIsValidWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber_withNSString_withComGoogleI18nPhonenumbersPhoneNumberUtil_withComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker_(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *number, NSString *candidate, ComGoogleI18nPhonenumbersPhoneNumberUtil *util, id<ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker> checker);

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_containsMoreThanOneSlashInNationalNumberWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber_withNSString_(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *number, NSString *candidate);

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_containsOnlyValidXCharsWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber_withNSString_withComGoogleI18nPhonenumbersPhoneNumberUtil_(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *number, NSString *candidate, ComGoogleI18nPhonenumbersPhoneNumberUtil *util);

FOUNDATION_EXPORT jboolean ComGoogleI18nPhonenumbersPhoneNumberMatcher_isNationalPrefixPresentIfRequiredWithComGoogleI18nPhonenumbersPhonenumber_PhoneNumber_withComGoogleI18nPhonenumbersPhoneNumberUtil_(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *number, ComGoogleI18nPhonenumbersPhoneNumberUtil *util);

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleI18nPhonenumbersPhoneNumberMatcher)

#endif

#if !defined (ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker_) && (ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE_ALL || defined(ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker_INCLUDE))
#define ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker_

@class ComGoogleI18nPhonenumbersPhoneNumberUtil;
@class ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber;
@class IOSObjectArray;
@class JavaLangStringBuilder;

/*!
 @brief Small helper interface such that the number groups can be checked according to different
 criteria, both for our default way of performing formatting and for any alternate formats we
 may want to check.
 */
@protocol ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker < NSObject, JavaObject >

/*!
 @brief Returns true if the groups of digits found in our candidate phone number match our
 expectations.
 @param number  the original number we found when parsing
 @param normalizedCandidate  the candidate number, normalized to only contain ASCII digits,
 but with non-digits (spaces etc) retained
 @param expectedNumberGroups  the groups of digits that we would expect to see if we
 formatted this number
 */
- (jboolean)checkGroupsWithComGoogleI18nPhonenumbersPhoneNumberUtil:(ComGoogleI18nPhonenumbersPhoneNumberUtil *)util
               withComGoogleI18nPhonenumbersPhonenumber_PhoneNumber:(ComGoogleI18nPhonenumbersPhonenumber_PhoneNumber *)number
                                          withJavaLangStringBuilder:(JavaLangStringBuilder *)normalizedCandidate
                                                  withNSStringArray:(IOSObjectArray *)expectedNumberGroups;

@end

J2OBJC_EMPTY_STATIC_INIT(ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker)

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleI18nPhonenumbersPhoneNumberMatcher_NumberGroupingChecker)

#endif

#pragma pop_macro("ComGoogleI18nPhonenumbersPhoneNumberMatcher_INCLUDE_ALL")
