import { TestBed } from '@angular/core/testing';

import { MediadataService } from './mediadata.service';

describe('MediadataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MediadataService = TestBed.get(MediadataService);
    expect(service).toBeTruthy();
  });
});
