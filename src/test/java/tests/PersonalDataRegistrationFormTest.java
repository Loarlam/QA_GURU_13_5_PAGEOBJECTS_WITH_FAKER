package tests;

import org.junit.jupiter.api.Test;

public class PersonalDataRegistrationFormTest extends TestBaseIncludingBeforeAndAfterTests {
    @Test
    void succesfulTest() {
        pageOfRegistrationForm.openingWebsiteWithoutAds()
                .settingFirstName(dataForTheTest.userName)
                .settingSurname(dataForTheTest.userSurname)
                .settingEmail(dataForTheTest.userEmail)
                .settingGender(dataForTheTest.userGenderDigit)
                .settingMobileNumber(dataForTheTest.userPhoneNumber)
                .settingDateOfBirth(dataForTheTest.userDayOfBirth, dataForTheTest.userMonthOfBirth, dataForTheTest.userYearOfBirth)
                .settingSubject(dataForTheTest.userSubjectFirstLetter)
                .settingHobbies(dataForTheTest.userHobbiesDigit)
                .uploadingPicture(dataForTheTest.userPicture)
                .settingAddress(dataForTheTest.userAddress)
                .selectingState(dataForTheTest.userState)
                .selectingCity(dataForTheTest.userCity)
                .clickingOnSubmit()
                .checkingResultFormValues(dataForTheTest.userName + " " + dataForTheTest.userSurname)
                .checkingResultFormValues(dataForTheTest.userEmail)
                .checkingResultFormValues(dataForTheTest.userGenderName)
                .checkingResultFormValues(dataForTheTest.userPhoneNumber)
                .checkingResultFormValues(dataForTheTest.userDayOfBirth + " " + dataForTheTest.userMonthOfBirth + "," + dataForTheTest.userYearOfBirth)
                .checkingResultFormValues(dataForTheTest.userSubjectFirstLetter)
                .checkingResultFormValues(dataForTheTest.userHobbiesName)
                .checkingResultFormValues(dataForTheTest.userPictureShortPath)
                .checkingResultFormValues(dataForTheTest.userAddress)
                .checkingResultFormValues(dataForTheTest.userState + " " + dataForTheTest.userCity);
    }
}