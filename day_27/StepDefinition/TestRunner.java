package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				 glue="StepDefinition",
				 plugin= {"pretty","html:target/htmlreport.html",
						 		   "json:target/jsonreport",
						 		   "junit:target/junitreport"})
public class TestRunner {

}


//
//[1mScenario:[22m Display all categories                         [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/AllCategory.feature:3[39m
//Aug 21, 2025 12:29:23 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:29:23 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application allcategory[39m [90m# StepDefinition.AllCategorySteps.user_launches_the_ebay_application_allcategory()[39m
//  [32m✔[39m [32m[1mWhen [22mUser views all categories[39m                       [90m# StepDefinition.AllCategorySteps.user_views_all_categories()[39m
//All categories page displayed
//  [32m✔[39m [32m[1mThen [22mAll categories should be displayed[39m              [90m# StepDefinition.AllCategorySteps.all_categories_should_be_displayed()[39m
//
//[1mScenario:[22m Add a product to cart and then remove it              [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Cart.feature:3[39m
//Aug 21, 2025 12:29:37 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:29:37 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application for cart operation[39m [90m# StepDefinition.CartSteps.user_launches_the_ebay_application_for_cart_operation()[39m
//Product added successfully
//  [32m✔[39m [32m[1mWhen [22mUser adds a product to cart[39m                            [90m# StepDefinition.CartSteps.user_adds_a_product_to_cart()[39m
//Product removed successfully
//  [32m✔[39m [32m[1mAnd [22mUser removes the product from cart[39m                      [90m# StepDefinition.CartSteps.user_removes_the_product_from_cart()[39m
//Cart verification complete. Test finished.
//  [32m✔[39m [32m[1mThen [22mCart should be empty after removal[39m                     [90m# StepDefinition.CartSteps.cart_should_be_empty_after_removal()[39m
//
//[1mScenario Outline:[22m Login with valid credentials                                     [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/EbayLogin.feature:10[39m
//Aug 21, 2025 12:30:06 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:30:06 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application for login[39m                             [90m# StepDefinition.EbayLoginSteps.user_launches_the_e_bay_application_for_login()[39m
//  [32m✔[39m [32m[1mWhen [22mUser logs in with username [1mraniya182002@gmail.com[22m and password [1mRaniya@123[22m[39m [90m# StepDefinition.EbayLoginSteps.user_logs_in_with_username_username_and_password_password(java.lang.String,java.lang.String)[39m
//Login successful
//  [32m✔[39m [32m[1mThen [22mLogin should be successful[39m                                                [90m# StepDefinition.EbayLoginSteps.login_should_be_successful()[39m
//
//[1mScenario:[22m Search multiple products           [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/EbaySearch.feature:3[39m
//Aug 21, 2025 12:30:16 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:30:16 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application[39m [90m# StepDefinition.EbaySearchSteps.user_launches_the_e_bay_application()[39m
//Searched: Watch
//Searched: Pen
//Searched: Laptop
//  [32m✔[39m [32m[1mWhen [22mUser searches multiple products[39m     [90m# StepDefinition.EbaySearchSteps.user_searches_multiple_products()[39m
//Search executed successfully
//  [32m✔[39m [32m[1mThen [22mProducts should be searched[39m         [90m# StepDefinition.EbaySearchSteps.products_should_be_searched()[39m
//
//[1mScenario:[22m Change site language                        [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Language.feature:9[39m
//Aug 21, 2025 12:30:36 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:30:36 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application language[39m [90m# StepDefinition.LanguageSteps.user_launches_the_ebay_application_language()[39m
//  [32m✔[39m [32m[1mWhen [22mUser changes language [1mSpain[22m[39m                  [90m# StepDefinition.LanguageSteps.user_changes_language_lang(java.lang.String)[39m
//Language changed
//  [32m✔[39m [32m[1mThen [22mLanguage should be changed[39m                   [90m# StepDefinition.LanguageSteps.language_should_be_changed()[39m
//
//[1mScenario Outline:[22m Check for valid and invalid credentials      [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Login.feature:8[39m
//Aug 21, 2025 12:30:50 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:30:50 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mlogin page should be open in default browser[39m         [90m# StepDefinition.loginStep.login_page_should_be_open_in_default_browser()[39m
//  [32m✔[39m [32m[1mWhen [22mclick on login button and enter[1m 87392164[22m and [1mpassword[22m[39m [90m# StepDefinition.loginStep.click_on_login_button_and_enter_username1_and_password1(java.lang.String,java.lang.String)[39m
//login checked!!
//  [32m✔[39m [32m[1mThen [22mlogin successfully and open home page[39m                 [90m# StepDefinition.loginStep.login_successfully_and_open_home_page()[39m
//
//[1mScenario Outline:[22m Check for valid and invalid credentials    [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Login.feature:9[39m
//Aug 21, 2025 12:30:58 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:30:58 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mlogin page should be open in default browser[39m       [90m# StepDefinition.loginStep.login_page_should_be_open_in_default_browser()[39m
//  [32m✔[39m [32m[1mWhen [22mclick on login button and enter[1m username[22m and [1mbdsfb8[22m[39m [90m# StepDefinition.loginStep.click_on_login_button_and_enter_username1_and_password1(java.lang.String,java.lang.String)[39m
//login checked!!
//  [32m✔[39m [32m[1mThen [22mlogin successfully and open home page[39m               [90m# StepDefinition.loginStep.login_successfully_and_open_home_page()[39m
//
//[1mScenario Outline:[22m Check for valid and invalid credentials         [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Login.feature:10[39m
//Aug 21, 2025 12:31:07 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:31:07 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mlogin page should be open in default browser[39m            [90m# StepDefinition.loginStep.login_page_should_be_open_in_default_browser()[39m
//  [32m✔[39m [32m[1mWhen [22mclick on login button and enter[1m bcjs74896hf[22m and [1mjdkfs783[22m[39m [90m# StepDefinition.loginStep.click_on_login_button_and_enter_username1_and_password1(java.lang.String,java.lang.String)[39m
//login checked!!
//  [32m✔[39m [32m[1mThen [22mlogin successfully and open home page[39m                    [90m# StepDefinition.loginStep.login_successfully_and_open_home_page()[39m
//
//[1mScenario Outline:[22m Check for valid and invalid credentials      [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Login.feature:11[39m
//Aug 21, 2025 12:31:21 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:31:21 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mlogin page should be open in default browser[39m         [90m# StepDefinition.loginStep.login_page_should_be_open_in_default_browser()[39m
//  [32m✔[39m [32m[1mWhen [22mclick on login button and enter[1m username[22m and [1mpassword[22m[39m [90m# StepDefinition.loginStep.click_on_login_button_and_enter_username1_and_password1(java.lang.String,java.lang.String)[39m
//login checked!!
//  [32m✔[39m [32m[1mThen [22mlogin successfully and open home page[39m                 [90m# StepDefinition.loginStep.login_successfully_and_open_home_page()[39m
//
//[1mScenario:[22m Right click on product image                  [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/RightClick.feature:3[39m
//Aug 21, 2025 12:31:31 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:31:31 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application rightclick[39m [90m# StepDefinition.RightClickSteps.user_launches_the_ebay_application_rightclick()[39m
//Product description: Men's Army Military Luminous 24 Hours Dial Nylon Strap Date Quartz Wrist Watch
//  [32m✔[39m [32m[1mWhen [22mUser right clicks on a product image[39m           [90m# StepDefinition.RightClickSteps.user_right_clicks_on_a_product_image()[39m
//Right clicked image successfully
//  [32m✔[39m [32m[1mThen [22mRight click action should be performed[39m         [90m# StepDefinition.RightClickSteps.right_click_action_should_be_performed()[39m
//
//[1mScenario:[22m successful search                                         [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/Search.feature:10[39m
//Aug 21, 2025 12:31:48 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:31:48 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mHome page should be open in default browser[39m               [90m# StepDefinition.SearchStep.home_page_should_be_open_in_default_browser()[39m
//  [32m✔[39m [32m[1mWhen [22mclick on search bar and the [1mOnline banking[22m and click enter[39m [90m# StepDefinition.SearchStep.click_on_search_bar_and_the_online_banking_and_click_enter(java.lang.String)[39m
//  [32m✔[39m [32m[1mThen [22mverify search functionality[39m                                [90m# StepDefinition.SearchStep.verify_search_functionality()[39m
//
//[1mScenario:[22m Display single category                     [90m# file:///C:/Users/raniy/eclipse-workspace/Cucumber_BDD/src/test/resources/features/SpecificCategory.feature:3[39m
//Aug 21, 2025 12:31:56 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
//WARNING: Unable to find CDP implementation matching 139
//Aug 21, 2025 12:31:56 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$4
//WARNING: Unable to find version of CDP to use for 139.0.7258.128. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.34.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
//  [32m✔[39m [32m[1mGiven [22mUser launches the eBay application specific[39m [90m# StepDefinition.SpecificCategorySteps.user_launches_the_ebay_application_specific()[39m
//  [32m✔[39m [32m[1mWhen [22mUser selects specific category[39m               [90m# StepDefinition.SpecificCategorySteps.user_selects_specific_category()[39m
//Navigated to Art category
//  [32m✔[39m [32m[1mThen [22mSpecific category should be displayed[39m        [90m# StepDefinition.SpecificCategorySteps.specific_category_should_be_displayed()[39m
