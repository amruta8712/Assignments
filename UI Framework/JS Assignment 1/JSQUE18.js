function translatePigLatin(str) {
    var firstVowel=str.match(/[aeiou]/);
    var firstPosition=str.indexOf(firstVowel);
    if(firstPosition>0)
    {
        document.write(str.slice(firstPosition)+str.slice(0,firstPosition)+'ay'+" ");
    }
    
}
translatePigLatin("The");
translatePigLatin("quick");
translatePigLatin("brown");
translatePigLatin("fox");