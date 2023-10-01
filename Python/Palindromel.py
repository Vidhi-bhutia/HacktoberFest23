def is_palindrome(input_string):
    # Remove spaces and convert to lowercase for case-insensitive comparison
    cleaned_string = input_string.replace(" ", "").lower()
    
    # Compare the cleaned string with its reverse
    return cleaned_string == cleaned_string[::-1]

# Test cases
input_str = "racecar"
if is_palindrome(input_str):
    print(f"{input_str} is a palindrome.")
else:
    print(f"{input_str} is not a palindrome.")
