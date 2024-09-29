function hashPassword() {
  var passwordField = document.getElementById("password");
  var hashedPassword = CryptoJS.SHA256(passwordField.value).toString();
  passwordField.value = hashedPassword; // Replace plain password with hashed one
}
