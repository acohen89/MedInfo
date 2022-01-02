#include <iostream>
#include <curl/curl.h>

using namespace std;

void makeRequest(string url){
    CURL *curl;
    CURLcode response;
    curl_global_init(CURL_GLOBAL_ALL);
    curl = curl_easy_init();
     if(curl) {
        curl_easy_setopt(curl, CURLOPT_URL, url);

        response = curl_easy_perform(curl);

        if(response != CURLE_OK) {
            cout <<  "Request failed: \n" << curl_easy_strerror(response);
        } else {
            cout << response << endl;
        }
        curl_easy_cleanup(curl);
    }
    curl_global_cleanup();
}
int main(){
    cout << "Hello World" << endl; 
    makeRequest("https://www.drugs.com/acetaminophen.html");

}

