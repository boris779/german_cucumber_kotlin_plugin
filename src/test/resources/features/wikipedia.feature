# language: de
# encoding: utf-8

@all
Funktionalität: wikipedia] Example Feature

  Szenario: [WIK-01 [wikipedia]
    Angenommen the start page is loaded
    Dann the searchbar is visible

  @boris @no_mobile
  Szenario: [WIK-02 [wikipedia]
    Angenommen the start page for "User_1" is loaded
    Und the start page for "User_2" is loaded
    Dann the active session should contain 1 window
    Wenn "User_2" opens software testing
    Dann "User_1" should be still on start page
    Und "User_2" should be still on software testing
