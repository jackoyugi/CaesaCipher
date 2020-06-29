# CaesaCipher
This is a cipher  rotatory for  letters of the alphabet A-Z

### By Jack Oyugi

### on 27, Jun, 2020

### Description
This app can be used for text encryption and decryption, `enter a text and see the magic`
the app is developed using `java`

## Behaviour Driven Development BDD
Fork the project from https://github.com/jackoyugi/CaesaCipher
And clone the directory in your local machine directory.
Open the project in intellij editor and run the project using gradle `java App`

### Encryption
Input
<ul>
<li>Select 1 for encryption</li>
<li>Enter the word or sentence to encode</li>
<li>Enter key for encode- this will shift the letters to the right by the number of times depending on the key used</li>
<ul>
Example when you enter `Hello` the encoded word `Lipps` when key is 4


Output
<li>Your text will be encoded and text displayed - result `Lipps`</li>

### Decryption
Input
<ul>
<li>Select 2 for encryption</li>
<li>Enter the encoded text above</li>
<li>Enter the same key used for encode- this will shift the letters back to their original position</li>
Example the encoded text `Lipps` the used key was 4 and it will decode the text back to `Hello`
</ul>

Output
<li>Your text will be decoded back and text displayed- result is `Hello`</li>

### Exit
To exit the app enter 0

### Technologies Used
<ol>
<li>Java- downloaded the sdk and jdk in ubuntu linux</li>
<li>itellij  code Editor- downloaded the editor</li>
<li>Gradle - download gradle and extract files</li>
</ol>

### Github repo link
https://github.com/jackoyugi/CaesaCipher


### Contact
For any inquery or input and contributions check out to me

### Restriction
The app works with positive numbers in the shift parameter.
The app only works with shift less than 26 and more than 0
The code violates Dry don't repeat yourself principle by repeating the calculation more than it has to.

### Pseudocode
Loop through each character in the string.
shift to the character by adding or substracting of letters in the alphabet (26)
Append the character on a new string.
Return the string.

### Invoking
System.out.println("xxx")

### Build

Run `gradle compileJava` on the terminal to build the project. The build artifacts will be stored in the `build/` directory.

### Running unit tests

Run test files using Red Green Refactor.


### Further help

To get more help on the github [CaesarCipher README](https://github.com/jackoyugi/README.md).
