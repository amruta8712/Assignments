function longestword(arr){
    return arr.slice().sort((a,b)=>{
        return b.length-a.length;
    })[0]
}
function mybox(arr){
    let finalString='';
    let word=longestword(arr);
    let asterisk='*'.repeat(word.length+4);
    finalString+=asterisk+'\n';
    for(let i=0;i<arr.length;i++)
    {
        if(arr[i].length<word.length)
        {
            let sub =word.length-arr[i].length;
            let spaces=' '.repeat(sub);
            finalString+='*'+arr[i]+'*'+'\n';
        }
        else{
            finalString+='*'+arr[i]+'*'+'\n';
        }
    }
    finalString+=asterisk;
    console.log(finalString);
}
mybox(["Hello","world","in","a","frame"])