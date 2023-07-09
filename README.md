<h1 align="center">
  Decipher Trisha
</h1>

<div align="center" >
   <img src="https://github.com/aidrecabrera/decipher-trisha/assets/61798731/15b6ba53-0e15-4b9e-9e40-ccd314769d7f" height="420" width="auto">
</div>

<br>

This is a simple Java program that allows me to decrypt an encrypted message sent by my girlfriend, Trisha. The program utilizes a decoding table to convert the encrypted message into its original form. This program allowed me to decrypt her message that allowed me to find a message that leads to her bio which also leads to a website containing her anniversary message along with a link to a <a href="https://www.youtube.com/watch?v=qcgaf8LhoRU">Puuung video</a>. Given above is the actual image sent from Trisha that shows the code chart and the ciphered message with word blank hints during our anniversary.


## Code Table (a.k.a. Cipher Table) 

The cipher table used in this program, referred to as "Trisha's Code Chart," maps specific coordinates to their corresponding letters. The table is constructed using a 4x7 grid, where each cell represents a unique combination of row and column numbers.

Here's an example of the code table:

```
A  B  C  D  E  F  G
H  I  J  K  L  M  N
O  P  Q  R  S  T  U
V  W  X  Y  Z  <3  .
```

In the above table, the last row contains special characters: `<3` represents a heart symbol, and `.` represents a period.

### TrishaCipherTable() explained

The `TrishaCipherTable()` method creates an empty `HashMap<String, String>` called `cipherTable` to store the mapping of coordinates to values.

Using nested loops, the method iterates over the rows and columns of the cipher table. The outer loop handles the rows, ranging from 1 to 4, while the inner loop handles the columns, ranging from 1 to 7.

Within the nested loops, the method constructs a `String` variable named `key` by combining the row and column indices converted to strings. This `key` represents the coordinate in the cipher table.

To determine the corresponding value for each coordinate, the method uses conditional statements to handle special cases.

If a coordinate is located in the last row and the second-to-last column (row 4, column 6), the value is set to "<3". This special character represents love.

If a coordinate is located in the last row and the last column (row 4, column 7), the value is set to ".". This special character denotes the end of a sentence or message.

For all other coordinates, the value is determined based on their position in the table using the formula `(char) ('A' + (i - 1) * 7 + (j - 1))`. This formula converts the row and column indices into their corresponding letters of the alphabet. Starting with the ASCII value of 'A', it increments based on the row and column indices to obtain the appropriate letter.

Once the value for a coordinate is determined, it is added to the `cipherTable` by invoking `cipherTable.put(key, value)`.

After completing the iterations over all rows and columns, the method returns the finalized `cipherTable`.

The `TrishaCipherTable()` method essentially generates the cipher table by mapping numerical coordinates to their corresponding letters or special characters, adhering to the specified rules. This table plays a crucial role in the decryption process, enabling the retrieval of the original values based on the encrypted coordinates.

## Usage

1. Compile the Java program using the following command:

   ```
   javac Main.java
   ```

2. Run the program:

   ```
   java Main
   ```

3. The program prompts to enter Trisha's encrypted message.

In this case, her message was "25-31-31-24 11-36 26-44 16-12 11-27-14 13-25-22-13-24 22-36-47 46."

4. The program decrypts the message using Trisha's decoding table and displays the decoded message on the console.

   Example output: `Decoded Message from Trisha: LOOK AT MY FB AND CLICK IT. <3`
