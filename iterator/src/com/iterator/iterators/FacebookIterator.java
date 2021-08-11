package com.iterator.iterators;

import java.util.ArrayList;
import java.util.List;

import com.iterator.profile.Profile;
import com.iterator.social_networks.Facebook;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String email;
    private int currentPos = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();
    
    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if(emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for(String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPos < emails.size();
    }

    @Override
    public Profile getNext() {
        if(!hasNext()) return null;

        String friendEmail = emails.get(currentPos);
        Profile friendProfile = profiles.get(currentPos);
        if(friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPos, friendProfile);
        }
        currentPos ++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPos = 0;
    }
}
