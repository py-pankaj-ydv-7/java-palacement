#include <iostream>
using namespace std;

int linersearch(int arr[],int key){
    for(int i=0 ; i<=6;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
}


int main(){
    int key;
    cout<<"enter a key ";
    cin>>key;
    int number[]={1,12,33,5,45,9};
    int index = linersearch(number,key);

    if(index ==-1){
        cout<<"not found ";
    }
    else{
        cout<<" key is at index : "<<index<<" key = "<<key;
    }
}