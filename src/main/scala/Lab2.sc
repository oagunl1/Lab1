val countryCodes = List("US", "ZH", "KR")

val test1 = "AB123456789ZH"
val test2 = "AB123UX"

def usps(pn : String) : Boolean = pn.length == 13 && checkLetterPart(pn.substring(0,2)) && checkNumberPart(pn.substring(2,11)) && checkCountryCode(pn.substring(11,13))

def checkLetterPart(lp : String) : Boolean =
  lp.forall(_.isLetter)

def checkNumberPart(np : String) : Boolean =
  np.forall(_.isDigit)

def checkCountryCode(cc : String) : Boolean =
  countryCodes.contains(cc.toUpperCase)

