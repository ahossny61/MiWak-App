package com.example.miwak;

public class word {
    private String mDefaultTranslation;
    private String mMiwakTranslation;
    private int mImageResourceId;
    private int mAudioResource;
    public word(String DefaultTranslation,String MiwakTranslation,int ImageResourceId,int AudioResource){
        mDefaultTranslation=DefaultTranslation;
        mMiwakTranslation=MiwakTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResource=AudioResource;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwakTranslation(){
        return mMiwakTranslation;
    }
    public void setmDefaultTranslation(String DefaultTranslation){
        mDefaultTranslation=DefaultTranslation;
    }
    public void setmMiwakTranslation(String MiwakTranslation){
        mMiwakTranslation=MiwakTranslation;
    }

    public int getmAudioResource() {
        return mAudioResource;
    }
}
