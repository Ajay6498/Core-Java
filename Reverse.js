function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');
  
    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  const inputSentence = "Hi Ajay, How are you..!";
  const reversedResult = reverseWordsInSentence(inputSentence);
  console.log(reversedResult);
  