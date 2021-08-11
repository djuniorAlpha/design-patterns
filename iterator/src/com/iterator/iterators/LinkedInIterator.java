package com.iterator.iterators;

import java.util.ArrayList;
import java.util.List;

import com.iterator.profile.Profile;
import com.iterator.social_networks.LinkedIn;

public class LinkedInIterator implements ProfileIterator {
    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPos = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();
    
    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if(emails.size() == 0) {
            List<String> contacts = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
            for(String profile : contacts) {
                this.emails.add(profile);
                this.contacts.add(null);
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
        Profile friendProfile = contacts.get(currentPos);
        if(friendProfile == null) {
            friendProfile = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
            contacts.set(currentPos, friendProfile);
        }
        currentPos ++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPos = 0;
    }
}